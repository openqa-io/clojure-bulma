(ns clojure-bulma.core-test
  (:require [clojure.test :refer :all]
            [clojure-bulma.core :refer :all]
            [hiccup.core :refer :all]
            [clojure-bulma.layout :refer :all]
            [clojure-bulma.utils :refer :all]))

(deftest layout
  (testing "Testing layout group"
    (testing "Container"
      (let [c1 (container {:class "is-fullhd"  :children [:p "Hello world"]})
            _ (println (html c1))]
        (is c1)))
    (testing "Footer"
      (let [c1 (footer {:class "is-fullhd" :id "my-footer" :children [:p "Hello world"]})
            _ (println (html c1))]
        (is c1)))))

(deftest util
  (testing "Testing utils"
    (testing "class"
      (let [c1 (class-names)
            c2 (class-names "abc def" "abc")]
        (println "c1 is:" c1 "\nc2 is:" c2)
        (is (= c1 ""))
        (is (= c2 "abc def"))))))
