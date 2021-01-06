(ns run-length-encoding
  (:require [clojure.string :as str]))

(defn encode-run
  "Encode a run of characters into a string."
  [[head & tail :as run]]
  (cond->> head
    tail (str (count run))))

(defn run-length-encode
  "Encode runs of characters into a string."
  [plain-text]
  (->> plain-text
       (partition-by identity)
       (map encode-run)
       (apply str)))

(defn decode-run
  "Decode a run into a string of characters."
  [[_ digit character]]
  (cond->> character
    (seq digit) (repeat (Integer/parseInt digit))))

(defn run-length-decode
  "Decode runs into a string."
  [cipher-text]
  (->> cipher-text
       (re-seq #"(\d*)(\D)")
       (mapcat decode-run)
       (apply str)))
