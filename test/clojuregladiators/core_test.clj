(ns clojuregladiators.core-test
  (:require [clojure.test :refer :all]
            [clojuregladiators.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))

(deftest gladiator-test
  (testing "Gladiator"
  (def glad (gladiator "Bot"))
    (testing "has health"
      (is (= (get glad :health) 100)))
    (testing "has no rage"
      (is (= (get glad :rage) 0)))
    (testing "is named Bot"
      (is (= (get glad :name) "Bot")))
    (testing "has attack low"
      (is (= (nil? (get glad :attackLow)) false)))
    (testing "Has attack high"
      (is (= (nil? (get glad :attackHigh)) false)))
      ))
