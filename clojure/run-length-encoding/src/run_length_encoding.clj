(ns run-length-encoding
  (:require [clojure.string :as str]))

(defn run-length-encode
  "encodes a string with run-length-encoding"
  [plain-text]
  (let [runs (re-seq #"(\w|\W)\1*" plain-text)]
    (apply str (filter #(not= 1 %) (interleave (map count (map first runs))
                                               (map last runs))))))
(defn decode-run
  "decode a single run in a run-length encoded sting"
  [run]
  (let [seqs (re-seq #"\d+|\D" run)]
    (if (Character/isDigit (first (first seqs)))
      (apply str (repeat (Integer/parseInt (first seqs)) (last seqs)))
      (str (first seqs)))))

(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text]
  (apply str (map decode-run (re-seq #"\d*\D" cipher-text))))
