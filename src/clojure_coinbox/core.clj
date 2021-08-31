(ns clojure-coinbox.core
  (:gen-class))

(println "Change maker demonstration loading" "\n" "~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~")

(def changeConversion (array-map "quarter" 25, "dime" 10, "nickel" 5, "cent" 1))

(defn makeChange
  ([balance] (if (int? balance) (makeChange balance (first changeConversion) (rest changeConversion) changeConversion) {}))
  ([balance conversionToPerform remainingOperations mapToReturn]
   (if (empty? conversionToPerform) mapToReturn
                                    (let [coin (key conversionToPerform)
                                          value (val conversionToPerform)
                                          numCoins (int (/ balance value))
                                          newBalance (- balance (* numCoins value))
                                          ]
                                      (makeChange newBalance (first remainingOperations) (rest remainingOperations) (assoc mapToReturn coin numCoins))
                                      ))))

(defn decimalStringToPennyInt
  ([text] (decimalStringToPennyInt text (re-find #"\d*\.??\d*$" text)) )
  ([text actualNumberString]
   (if (empty? actualNumberString) -1 (int (* (bigdec actualNumberString) 100)))))

(defn pluralize [number name] (str number " " name (if (or (> number 1) (= number 0))  "s")))

(defn pennyIntToDollarString
  ([pennyInt] (if (int? pennyInt) (pennyIntToDollarString (int (/ pennyInt 100)) (mod pennyInt 100)) "Not an int!" ))
  ([dollars cents]
   (str "$" dollars "." (if (< cents 10) "0") cents)))

(defn promptPrint
  ([text] (print (str text ": "))    (flush))
  ([text default] (promptPrint (str text ". Upon empty or invalid input, the default is "
                                    default)) ))


(defn getPennyIntGivenPromptWithDefault
  ([prompt] (getPennyIntGivenPromptWithDefault prompt 0))
  ([prompt defaultAmountPennies]
   (promptPrint prompt (pennyIntToDollarString defaultAmountPennies))
   (let [numberInput (decimalStringToPennyInt (read-line)) ]
     (if (= numberInput -1) defaultAmountPennies numberInput))))

(defn printlnReturn [message value]
  (println message value) value)

(defn inputGenerateChangeMap []
  (let [price (getPennyIntGivenPromptWithDefault "Enter the price of the item" 156)
        inputMoney (getPennyIntGivenPromptWithDefault "Enter the amount of money inserted" 200)]

    (println (str "OK, the money you are inserting is " (pennyIntToDollarString inputMoney)
                  " and the price is " (pennyIntToDollarString price) "."))  (println)

    (makeChange (if (< inputMoney price)
                  ( printlnReturn "Insufficient funds; you get this many cents back: " inputMoney)
                  ( printlnReturn "All right! A purchase! You get this many cents back: " (- inputMoney price))
                  ))))

(defn pluralizeMap
  [givenMap]
  (clojure.string/replace (reduce-kv #(str %1 (pluralize %3 %2) ", " ) "" givenMap)
    #"(.*, )(.*)(, )" "$1and $2."))

(defn demonstrate []
  (let [ coins (printlnReturn "Here's the map generated:" (inputGenerateChangeMap))]
    (println)
    (println
      (str    "In plain English, that's " (pluralizeMap coins)  " Spend it wisely!")

    )
  ))

(defn -main []
  (demonstrate)
  )

; Uncomment out the below to run directly from this file
; (demonstrate)