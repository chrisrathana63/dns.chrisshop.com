from fastapi import FastAPI
import subprocess, json

app = FastAPI()

@app.get("/network/{net}")
def inspect_network(net: str):
    result =   subprocess.check_output(["docker", "network", "inspect", net])
    return json.loads(result)
  
