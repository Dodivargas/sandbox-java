Contract.make {
    request {
        method 'POST'
        url '/pessoa'
        body("""
    {
      "nome":"douglas",
      "cpf": 123.456.789-10
    }
    """)
        headers {
            header('Content-Type', 'application/json')
        }
    }
    response {
        status 200
        headers {
            header('Content-Type': 'text')
        }
    }
}
