(ns flake.util
  (:require [clojure.java.io :as io])
  (:import [java.nio ByteBuffer]))

(def ^{:const true :private true}
  base62-alphabet
  "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")

(def ^{:const true :private true}
  int-boundary
  "0123456789")

(defn encode
  "Encodes n in a new base of ks."
  [ks n]
  (let [base (count ks)]
    (->> (iterate #(quot % base) n)
         (take-while pos?)
         (reduce (fn [acc n]
                   (conj acc (nth ks (mod n base))))
                 nil)
         (apply str))))

(def ^{:doc "Encodes a given value into a base62 representation."}
  base62-encode
  (partial encode base62-alphabet))
