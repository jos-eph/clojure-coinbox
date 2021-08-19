(ns clojure-coinbox.core-test
  (:require [clojure.test :refer :all]
            [clojure-coinbox.core :refer :all]))

(deftest fortyone
  (testing "Change for $0.41"
    (is (=
          {:quarters 1, :dimes 1, :nickels 1, :pennies 1}
          (clojure-coinbox.core/makeChange 41)
          )
        )

    ))

(deftest forty
  (testing "Change for $0.40"
    (is (=
          {:quarters 1, :dimes 1, :nickels 1, :pennies 0}
          (clojure-coinbox.core/makeChange 40)
          )
        )

    ))

(deftest nineteen
  (testing "Change for $0.16"
    (is (=
          {:quarters 0, :dimes 1, :nickels 1, :pennies 1}
          (clojure-coinbox.core/makeChange 16)
          )
        )

    ))

(deftest six
  (testing "Change for $0.06"
    (is (=
          {:quarters 0, :dimes 0, :nickels 1, :pennies 1}
          (clojure-coinbox.core/makeChange 6)
          )
        )

    ))

(deftest six
  (testing "Change for $0.01"
    (is (=
          {:quarters 0, :dimes 0, :nickels 0, :pennies 1}
          (clojure-coinbox.core/makeChange 1)
          )
        )

    ))


(deftest zeroCents
  (testing "Change for $0"
    (is (=
          {:quarters 0, :dimes 0, :nickels 0, :pennies 0}
          (clojure-coinbox.core/makeChange 0)
          )
        )

    ))


(deftest oneFifty
  (testing "Change for $1.50"
    (is (=
          {:quarters 6, :dimes 0, :nickels 0, :pennies 0}
          (clojure-coinbox.core/makeChange 150)
          )
        )

    ))

(deftest twenty
  (testing "Change for $0.20"
    (is (=
          {:quarters 0, :dimes 2, :nickels 0, :pennies 0}
          (clojure-coinbox.core/makeChange 20)
          )
        )

    ))

(deftest fifteen
  (testing "Change for $0.15"
    (is (=
          {:quarters 0, :dimes 1, :nickels 1, :pennies 0}
          (clojure-coinbox.core/makeChange 15)
          )
        )

    ))

(deftest twentysix
  (testing "Change for $0.26"
    (is (=
          {:quarters 1, :dimes 0, :nickels 0, :pennies 1}
          (clojure-coinbox.core/makeChange 26)
          )
        )

    ))

(deftest thirtyfive
  (testing "Change for $0.35"
    (is (=
          {:quarters 1, :dimes 1, :nickels 0, :pennies 0}
          (clojure-coinbox.core/makeChange 35)
          )
        )

    ))

(deftest four
  (testing "Change for $0.04"
    (is (=
          {:quarters 0, :dimes 0, :nickels 0, :pennies 4}
          (clojure-coinbox.core/makeChange 4)
          )
        )

    ))

(deftest eleven
  (testing "Change for $0.11"
    (is (=
          {:quarters 0, :dimes 1, :nickels 0, :pennies 1}
          (clojure-coinbox.core/makeChange 11)
          )
        )

    ))

(deftest oneFiftyOne
  (testing "Change for $1.51"
    (is (=
          {:quarters 6, :dimes 0, :nickels 0, :pennies 1}
          (clojure-coinbox.core/makeChange 151)
          )
        )

    ))
