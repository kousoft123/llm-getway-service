Assignment 3: LLM Gateway Skeleton (Abstraction Design)
Time :60 minutes
Problem Statement
Design a simplified LLM Gateway that abstracts multiple LLM providers.
Must Have
1.Interface:
2.interface LlmService {
3.String generate(String prompt);

4.Two implementations:
  o OpenAI (real or mocked)
  o Stubbed LocalModel
5.Runtime switching via config
6.One REST endpoint: /generate
