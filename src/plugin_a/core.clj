(ns plugin-a.core
  (:require [clojure.tools.cli :refer [parse-opts]]
            [taoensso.timbre :as log]))

(defn init []
  (log/info "------>>>plugin-a loaded<<<--------"))


(defn -main [& args] (println "hello world"))
