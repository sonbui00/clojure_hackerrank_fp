(ns hackerrank-fp.002-hello-world-n-times)

(def hello_world_n_times
  (fn [n]
    (print
      (clojure.string/join
        "\n"
        (loop
          [strings [], i n]
          (if (zero? i)
            strings
            (recur (cons "Hello World" strings) (- i 1))))))))
