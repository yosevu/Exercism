(ns queen-attack
  (:require [clojure.string :as str]))

(def empty-board (vec (repeat 8 (vec (repeat 8 "_")))))

(defn add-piece
  "Returns a board with a piece if present."
  [piece position board]
  (if position
    (assoc-in board position piece)
    board))

(defn board-string
  "Returns a board string."
  [{:keys [b w]}]
  (str (->> empty-board
            (add-piece "B" b)
            (add-piece "W" w)
            (map #(str/join " " %))
            (str/join "\n")) "\n"))

(defn same-rank?
  "Returns true if queens are on the same rank, false otherwise."
  [b-x w-x]
  (= b-x w-x))

(defn same-file?
  "Returns true if queens are on the same rank, false otherwise."
  [b-y w-y]
  (= b-y w-y))

(defn same-diagonal?
  "Returns true if queens are on the same diagonal, false otherwise."
  [[b-x b-y] [w-x w-y]]
  (= (- b-x w-x)
     (- b-y w-y)))

(defn can-attack
  "Returns true if queens can attack each other, false otherwise."
  [{[w-x w-y :as w] :w
    [b-x b-y :as b] :b}]
  (or
   (same-rank? b-x w-x)
   (same-file? b-y w-y)
   (same-diagonal? b w)))
