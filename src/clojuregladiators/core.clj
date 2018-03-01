(ns clojuregladiators.core
  (:gen-class))

(defn gladiator 
"A map instance of a gladiator with the following parameters:\n\t-health
\n\t-rage\n\t-name\n\t-attack low\n\t-attack high"[name]
 
  {:health 100
  :rage 0
  :name name
  :attackLow 10
  :attackHigh 25})

(defn -main
  [& args]
  (println "Player One Name: ")
  (def gladiatorOneName (read-line))
  (println "Player Two Name: ")  
  (def gladiatorTwoName (read-line)) 
  (def gladiatorOne (gladiator gladiatorOneName))
  (def gladiatorTwo (gladiator gladiatorTwoName))
  (println "Gladiator One Name is" gladiatorOneName "and gladiator Two name is" gladiatorTwoName)
  (println (get gladiatorOne :name))
  )





