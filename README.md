Run following commands:

```bash
docker-compose build
docker-compose up
```

Login/password for grafana: admin/admin

Ports available outside docker network (http://localhost:{port}):
- 8080 - spring application (in internal docker network http://spring:8080)
- 3000 - grafana (in internal docker network http://grafana:3000)
- 9090 - prometheus (in internal docker network http://prometheus:9090)
