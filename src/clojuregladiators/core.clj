(ns clojuregladiators.core
  (:gen-class))


(defn -main
  [& args]
  (defn gladiator [name] 
  {:health 100
  :rage 0
  :name name
  :attackLow 10
  :attackHigh 25})
  (def gladiatorOneName (read-line))
  (def gladiatorTwoName (read-line)) 
  (def gladiatorOne (gladiator "Shedlia"))
  (def gladiatorTwo (gladiator "Shelly"))
  (println "Gladiator One Name is" gladiatorOneName "and gladiator Two name is" gladiatorTwoName)
  (println (get gladiatorOne :name))
  )





