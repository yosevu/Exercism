(ns armstrong-numbers
  (:require  [clojure.string :as str]))

(defn pow
  "Returns base to exp power."
  [base exp]
  (reduce * (repeat exp base)))

(defn num->num-coll
  "Returns num as list strings."
  [n]
  (map #(Integer/parseInt %) (str/split (str n) #"")))

(defn armstrong-number
  "Calculates armstrong number."
  [len acc x]
  (+ acc (pow x len)))

(defn armstrong?
  "Returns true if n is an armstrong number, false otherwise."
  [n]
  (= (reduce (partial armstrong-number (count (str n))) 0 (num->num-coll n)) n))
