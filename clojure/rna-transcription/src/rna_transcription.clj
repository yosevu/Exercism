(ns rna-transcription
  (:require [clojure.string :as str]))

(def nucleotides {\G \C \C \G \T \A \A \U})

(defn to-rna [dna]
  (let [rna (apply str (map #(nucleotides %) dna))]
    (assert (every? #(contains? nucleotides %) dna))
    rna))
