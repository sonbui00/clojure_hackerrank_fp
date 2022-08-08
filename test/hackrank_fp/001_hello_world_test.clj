(ns hackrank-fp.001-hello-world-test
  (:require [clojure.test :refer :all])
  (:require [hackrank-fp.001-hello-world :refer :all]))

(defn solution-print-value []
  (with-out-str (solution)))

(deftest hello-world-test
  (testing "Print: Hello World'."
    (is (= (solution-print-value) "Hello World"))))
