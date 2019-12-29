(ns java-learning.Variables
 (:gen-class
  :prefix "-"))
  


(create-ns 'java-learning.Variables.StaticVarExample)
(intern 'java-learning.Variables.StaticVarExample 'my-class-var (atom "class or static variable"))



(defn -main
  [& args]
  (println @java-learning.Variables.StaticVarExample/my-class-var)
  (reset! java-learning.Variables.StaticVarExample/my-class-var "changed text")
  (println @java-learning.Variables.StaticVarExample/my-class-var))



; in the repl:
;    (compile 'java-learning.Variables)
;    (import (java-learning.Variables StaticVarExample))
;    (use 'clojure.reflect 'clojure.pprint)
;    (reflect java_learning.Variables)  ;;shows methods and the flags of a java class. very informative
;    (java-learning.Variables/main (make-array java.lang.String 0))
