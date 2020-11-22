(ns bob
  (:require [clojure.string :as str]))

(defn upper-case?
  "Returns true if s is equal when upper-cased and not equal when lower-cased."
  [s]
  (and (= (str/upper-case s) s) (not= (str/lower-case s) s)))

(defn question?
  "Returns true if s is a question."
  [s]
  (= (last (str/trim s)) \?))

(defn response-for [s]
  (cond (str/blank? s) "Fine. Be that way!"
        (and (question? s) (not (upper-case? s))) "Sure."
        (and (upper-case? s) (not (question? s))) "Whoa, chill out!"
        (and (question? s) (upper-case? s)) "Calm down, I know what I'm doing!"
        :else "Whatever."))
