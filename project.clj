(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :dependencies
  [[adzerk/boot-cljs "1.7.228-1" :scope "test"]
   [adzerk/boot-cljs-repl "0.3.3" :scope "test"]
   [adzerk/boot-reload "0.4.12" :scope "test"]
   [pandeiro/boot-http "0.7.1-20151103.174541-1" :scope "test"]
   [crisptrutski/boot-cljs-test
    "0.2.2-20160812.063138-4"
    :scope
    "test"]
   [org.clojure/clojure "1.9.0-alpha12"]
   [org.clojure/clojurescript "1.9.229"]
   [com.cemerick/piggieback "0.2.1" :scope "test"]
   [weasel "0.7.0" :scope "test"]
   [org.clojure/tools.nrepl "0.2.12" :scope "test"]
   [boot/core "2.6.0" :scope "compile"]]
  :repositories
  [["clojars" {:url "https://clojars.org/repo/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :source-paths
  ["src" "html"])