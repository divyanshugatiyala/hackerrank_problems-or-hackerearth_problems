# Initial values of Alpha and Beta
Maximum, Minimum = 1000, -1000
def AlphaBetaPruning(depth, nodeIndex, maximizingPlayer,
			values, alpha, beta):

	# leaf node is reached
	if depth == 3:
		return values[nodeIndex]

	if maximizingPlayer:
	
		best = Minimum

		for i in range(0, 2):
			
			val = AlphaBetaPruning(depth + 1, nodeIndex * 2 + i,
						False, values, alpha, beta)
			best = max(best, val)
			alpha = max(alpha, best)

			# Alpha Beta Pruning
			if beta <= alpha:
				break
		
		return best
	
	else:
		best = Maximum

		
		for i in range(0, 2):
		
			val = AlphaBetaPruning(depth + 1, nodeIndex * 2 + i,
							True, values, alpha, beta)
			best = min(best, val)
			beta = min(beta, best)

			# Alpha Beta Pruning
			if beta <= alpha:
				break
		
		return best

if __name__ == "__main__":

	values = [4, 9, 6, 10, 3, 8, 0, -1]
	print("The optimal value is :", AlphaBetaPruning(0, 0, True, values, Minimum, Maximum))
	
