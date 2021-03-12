## Teorema Mestre

$$T(n) = a ∗ T(n/b) + f(n)$$

Sendo a ≥ 1, b > 1 e f(n) não negativa.

→ **a** representa a quantidade de chamadas recursivas (quantidade de subproblemas).

→ **b** representa em quanto a entrada é diminuída a cada chamada recursiva.

→ **f(n)** representa o custo parcial de cada etapa da recursão.

O Teorema Mestre estabelece que:

- Se f(n) < n ** log de **a** na base **b**, então T(n) = Θ(n ** log de **a** na base **b**).
- Se f(n) = n ** log de **a** na base **b**, então T(n) = Θ(f(n) * log de **n** na base **b**).
- Se f(n) > n ** log de **a** na base **b**, então T(n) = Θ(f(n)).