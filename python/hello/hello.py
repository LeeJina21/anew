from bottle import route, run

@route('/<name>')
def inde(name="World");
    return 'Hello %s' % name
run(host='0.0.0.0', port=8000, threaded=True)
