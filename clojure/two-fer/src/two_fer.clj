(ns two-fer)

;; Version 1
;; (defn two-fer [& name]
;;   (if (nil? name)
;;     "One for you, one for me."
;;     (str "One for " (first name) ", one for me.")))

;; Version 2
(defn two-fer
  ([] (two-fer "you"))
  ([name] (str "One for " name ", one for me.")))
