;;
;; fizzbuzz.clj
;;
;; --tkp
;;

(defn fizzbuzz [n]
  (map #(cond 
          (zero? (mod % 15)) (println "fizzbuzz")
          (zero? (mod %  5)) (println "fizz")
          (zero? (mod %  3)) (println "buzz")
          :else (println %))
       (range 1 (inc n))))
