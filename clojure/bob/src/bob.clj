(ns bob
  (:require [clojure.string :as str]))

(defn upper-case?
  "Returns true if s is equal when upper-cased and not equal when lower-cased."
  [s]
  (and (= (str/upper-case s) s) (not= (str/lower-case s) s)))

(defn question?
  "Returns true if s is a question."
  [s]
  (str/ends-with? (str/trim s) "?"))

(defn response-for [s]
  (cond
    (and (question? s) (not (upper-case? s))) "Sure."
    (and (upper-case? s) (not (question? s))) "Whoa, chill out!"
    (and (question? s) (upper-case? s)) "Calm down, I know what I'm doing!"
    (str/blank? s) "Fine. Be that way!"
    :else "Whatever."))

;; Implicit order dependency. The most specific condition has to be first.
;; (defn response-for [s]
;;   (cond
;;     (and (question? s) (upper-case? s)) "Calm down, I know what I'm doing!"
;;     (question? s) "Sure."
;;     (upper-case? s) "Whoa, chill out!"
;;     (str/blank? s) "Fine. Be that way!"
;;     :else "Whatever."))
