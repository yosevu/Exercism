(ns reverse-string
  (:require  [clojure.string :as str]))

;; Restrictions: reverse

;; Version 1
;; (defn reverse-string [s]
;;   (str/join
;;     (reduce #(cons %2 %1)
;;             '()
;;             (str/split s #""))))

;; Version 2
(defn reverse-string [s]
  (str/join (into () s)))
