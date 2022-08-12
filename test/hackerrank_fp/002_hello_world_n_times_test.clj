(ns hackerrank-fp.002-hello-world-n-times-test
  (:require [clojure.test :refer :all]
            [hackerrank-fp.002-hello-world-n-times :refer :all]))

(def input 4)
(def output "Hello World\nHello World\nHello World\nHello World")

(deftest hello-world-n-times-test
  (testing "Print: Hello World N times."
    (is (= output (with-out-str (hello_world_n_times input))))))
