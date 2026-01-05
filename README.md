Assignment 3 — LLM Gateway Skeleton (Abstraction Design)

Time: 60 minutes

📌 Problem Statement

Design a simplified LLM Gateway that abstracts multiple LLM providers behind a common interface.

✅ Must Have Requirements
1️⃣ Interface
public interface LlmService {
    String generate(String prompt);
}

2️⃣ Implementations

OpenAI Provider (real or mocked)

Stubbed LocalModel Provider

3️⃣ Runtime Switching via Configuration

The active implementation should be selected dynamically using configuration (e.g., application properties or profile).

4️⃣ REST Endpoint

Expose a single endpoint:

POST /generate


Request Body Example:

{
  "prompt": "Explain abstraction in software design."
}


Response Example:

{
  "response": "Abstraction is a design principle that hides implementation details..."
}
