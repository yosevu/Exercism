(ns two-fer)

(defn two-fer
  ([] (two-fer "you"))
  ([s] (str "One for " s ", one for me.")))
