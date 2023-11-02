(defproject coderetreat-clojure-sandbox "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.25.0"]]}}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.github.seancorfield/expectations "2.1.188"]]
  :main coderetreat-clojure-sandbox.core)
