(ns java-learning.Variables
  (:gen-class))

(def my-class-var (atom "class or static variable"))

(defn -main
  [& args]
  (println @java-learning.Variables/my-class-var)
  (reset! java-learning.Variables/my-class-var "changed text")
  (println @java-learning.Variables/my-class-var))

; in the repl:
;    (compile 'java-learning.Variables)
;    (import (java_learning Variables))
;    (use 'clojure.reflect 'clojure.pprint)
;    (reflect java_learning.Variables)  ;;shows methods and the flags of a java class. very informative
;    (java-learning.Variables/main (make-array java.lang.String 0))
