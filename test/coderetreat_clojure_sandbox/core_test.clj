(ns coderetreat-clojure-sandbox.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [expectations.clojure.test
             :refer [defexpect expect expecting]]
            [coderetreat-clojure-sandbox.core :refer :all]))

; https://cljdoc.org/d/com.github.seancorfield/expectations/2.1.188/doc/readme

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(defexpect equality
  (expect 1 (* 1 1))
  (expect "foo" (str "f" "oo")))

(defexpect regex-1
  (expect #"foo" "It's foobar!"))