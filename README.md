# System Design Implementations

Production-style implementations of real-world distributed systems and scalable backend architectures using Java, Spring Boot, Kafka, Redis, Docker, and cloud-native engineering practices.

This repository focuses on learning system design through hands-on implementation rather than only theoretical high-level diagrams.

---

## Objective

The goal of this repository is to deeply understand and implement scalable backend systems commonly discussed in:

- Backend Engineering Interviews
- System Design Interviews
- Distributed Systems Engineering
- High-Scale Production Architectures

Each project focuses on real engineering challenges such as:

- Scalability
- Fault Tolerance
- Concurrency
- Caching
- Event-Driven Architecture
- Idempotency
- Distributed Coordination
- Performance Optimization

---

#  Implemented Systems

| System | Concepts Covered |
|---|---|
| URL Shortener | Base62 Encoding, Distributed ID Generation, Caching |
| Rate Limiter | Token Bucket, Sliding Window, Redis |
| Expense Splitter | Low-Level Design, Transactions, Concurrency |
| Notification Service | Kafka, Retries, Dead Letter Queue |
| API Gateway | Routing, Authentication, Rate Limiting |
| Chat System | WebSockets, Pub/Sub, Presence Tracking |
| Distributed Cache | Cache Invalidation, Eviction Strategies |
| Job Scheduler | Worker Pools, Retry Mechanisms |
| Search Autocomplete | Trie, Ranking, Query Optimization |
| Leaderboard System | Redis Sorted Sets, Real-Time Ranking |

---

# Tech Stack

## Backend
- Java
- Spring Boot
- Spring Security
- Hibernate / JPA
- REST APIs

## Distributed Systems
- Kafka
- Redis
- Async Processing
- Thread Pools

## Infrastructure
- Docker
- Docker Compose
- AWS Concepts

## Observability
- OpenTelemetry
- Prometheus
- Grafana

## Database
- MySQL
- PostgreSQL

---

# Repository Structure

```text
system-design-implementations/
│
├── url-shortener/
├── rate-limiter/
├── expense-splitter/
├── notification-service/
├── api-gateway/
├── chat-system/
├── distributed-cache/
├── job-scheduler/
├── search-autocomplete/
├── leaderboard-system/
│
├── common/
│
└── README.md
