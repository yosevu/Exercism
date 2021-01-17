(ns beer-song
  (:require [clojure.string :as str]))

(defn plural
  "Returns the reglar plural suffix, -s, when num is greater than 1."
  [num]
  (when (> num 1) "s"))

(defmulti verse identity)

(defmethod verse 0 [_]
  (str "No more bottles of beer on the wall, no more bottles of beer.\n"
       "Go to the store and buy some more, 99 bottles of beer on the wall.\n"))

(defmethod verse 1 [num]
  (str num " bottle of beer on the wall, " num " bottle of beer.\n"
       "Take it down and pass it around, no more bottles of beer on the wall.\n"))

(defmethod verse :default [num]
  (str num " bottles of beer on the wall, " num " bottles of beer.\n"
       "Take one down and pass it around, " (dec num) " bottle" (plural (dec num)) " of beer on the wall.\n"))

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start] (sing start 0))
  ([start end] (str/join "\n" (map verse (reverse (range end (inc start)))))))
