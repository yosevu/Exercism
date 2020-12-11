(ns rna-transcription
  (:require [clojure.string :as str]))

(def nucleotides {\G \C \C \G \T \A \A \U})

(defn valid-strand
  [strand]
  (if (nucleotides strand)
    (nucleotides strand)
    (throw (AssertionError. "Invalid DNA strand."))))

(defn to-rna [dna]
  (str/join (map valid-strand dna)))
