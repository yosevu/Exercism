(ns armstrong-numbers)

(defn num->digits
  "Returns n a list of string digits."
  [n]
  (->> n
       (iterate #(quot % 10))
       (take-while pos?)
       (map #(rem % 10))))

(defn pow
  "Returns x to the n power."
  [base exp]
  (apply * (repeat exp base)))

(defn armstrong?
  "Returns true if n is an armstrong number, false otherwise."
  [num]
  (let [digits (num->digits num)]
    (->> digits
         (map #(pow % (count digits)))
         (apply +)
         (= num))))
