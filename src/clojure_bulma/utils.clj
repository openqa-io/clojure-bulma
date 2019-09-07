(ns clojure-bulma.utils
  (:require [hiccup.core :refer :all]
            [clojure.string :refer [join split trim]]))

(defn class-names
  "Generate class names"
  ([] "")
  ([& args]
   (->> args
        (map (fn [arg] (map trim (split (or arg "") #" "))))
        (map (partial into #{}))
        (reduce into #{})
        (filter (partial not= ""))
        (join " "))))

(defn attach-class-name
  "attach class names to hiccup attrs"
  ([attrs to-add]
   (let [{class :class} attrs
         new-class-name (class-names class to-add)]
     (if (not= new-class-name "")
       (-> attrs
           (assoc :class new-class-name)
           (dissoc :children))
       (dissoc attrs :class :children)))))
