(ns todo-api.lists.handler
  [:require [todo-api.contrib.responses :as responses]])

(def create-list {:name :create-list
                  :enter (fn [context] (let [request (:request context)
                                             response (responses/ok request)]
                                         (assoc context :response response)))})
