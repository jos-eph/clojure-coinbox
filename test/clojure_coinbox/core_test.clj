(ns clojure-coinbox.core-test
  (:require [clojure.test :refer :all]
            [clojure-coinbox.core :refer :all]))

(deftest fortyone
  (testing "Change for $0.41"
    (is (=
          {"quarter" 1, "dime" 1, "nickel" 1, "cent" 1}
          (clojure-coinbox.core/makeChange 41)
          )
        )

    ))

(deftest forty
  (testing "Change for $0.40"
    (is (=
          {"quarter" 1, "dime" 1, "nickel" 1, "cent" 0}
          (clojure-coinbox.core/makeChange 40)
          )
        )

    ))

(deftest nineteen
  (testing "Change for $0.16"
    (is (=
          {"quarter" 0, "dime" 1, "nickel" 1, "cent" 1}
          (clojure-coinbox.core/makeChange 16)
          )
        )

    ))

(deftest six
  (testing "Change for $0.06"
    (is (=
          {"quarter" 0, "dime" 0, "nickel" 1, "cent" 1}
          (clojure-coinbox.core/makeChange 6)
          )
        )

    ))

(deftest six
  (testing "Change for $0.01"
    (is (=
          {"quarter" 0, "dime" 0, "nickel" 0, "cent" 1}
          (clojure-coinbox.core/makeChange 1)
          )
        )

    ))


(deftest zeroCents
  (testing "Change for $0"
    (is (=
          {"quarter" 0, "dime" 0, "nickel" 0, "cent" 0}
          (clojure-coinbox.core/makeChange 0)
          )
        )

    ))


(deftest oneFifty
  (testing "Change for $1.50"
    (is (=
          {"quarter" 6, "dime" 0, "nickel" 0, "cent" 0}
          (clojure-coinbox.core/makeChange 150)
          )
        )

    ))

(deftest twenty
  (testing "Change for $0.20"
    (is (=
          {"quarter" 0, "dime" 2, "nickel" 0, "cent" 0}
          (clojure-coinbox.core/makeChange 20)
          )
        )

    ))

(deftest fifteen
  (testing "Change for $0.15"
    (is (=
          {"quarter" 0, "dime" 1, "nickel" 1, "cent" 0}
          (clojure-coinbox.core/makeChange 15)
          )
        )

    ))

(deftest twentysix
  (testing "Change for $0.26"
    (is (=
          {"quarter" 1, "dime" 0, "nickel" 0, "cent" 1}
          (clojure-coinbox.core/makeChange 26)
          )
        )

    ))

(deftest thirtyfive
  (testing "Change for $0.35"
    (is (=
          {"quarter" 1, "dime" 1, "nickel" 0, "cent" 0}
          (clojure-coinbox.core/makeChange 35)
          )
        )

    ))

(deftest four
  (testing "Change for $0.04"
    (is (=
          {"quarter" 0, "dime" 0, "nickel" 0, "cent" 4}
          (clojure-coinbox.core/makeChange 4)
          )
        )

    ))

(deftest eleven
  (testing "Change for $0.11"
    (is (=
          {"quarter" 0, "dime" 1, "nickel" 0, "cent" 1}
          (clojure-coinbox.core/makeChange 11)
          )
        )

    ))

(deftest oneFiftyOne
  (testing "Change for $1.51"
    (is (=
          {"quarter" 6, "dime" 0, "nickel" 0, "cent" 1}
          (clojure-coinbox.core/makeChange 151)
          )
        )

    ))
