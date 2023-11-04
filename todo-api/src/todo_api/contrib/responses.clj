(ns todo-api.contrib.responses)

(defn response [status body]
  {:status status :body {:message "Hello World"}})

(def ok (partial response 200))
