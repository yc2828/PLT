
public class LOGOBasic {
	/*
	 * Move turtle forward/backward with arg0.run() length
	 * @arg0: LOGONode returning value of step size
	 * @isForward: true for forward, flase for backward
	 */
	public void forward(LOGONode arg0, boolean isForward) {
		Object ret = arg0.run();
		if (ret instanceof Double) {
			double step = (isForward) ? ((Double)ret).doubleValue() :
										-((Double)ret).doubleValue();
			System.out.println("step size:" + step);
			double startX = LOGOPP.canvas.turtle.getXPos();
			double startY = LOGOPP.canvas.turtle.getYPos();
			double directX = Math.cos(Math.toRadians(LOGOPP.canvas.turtle.getAngle()));
			double directY = Math.sin(Math.toRadians(LOGOPP.canvas.turtle.getAngle()));
			moveTurtle(startX + directX * step, startY + directY * step, 
							LOGOPP.canvas.turtle.getPenDown());
		} else {
			//TODO: errorhandler
		}
	}

	/*
	 * Rotate the turtle
	 * @arg0: LOGONode returning value of rotation degree
	 * @isLeft: true for turning left, false for turning right
	 */
	public void turn(LOGONode arg0, boolean isLeft) {
		Object ret = arg0.run();
		if (ret instanceof Double) {
			double turn = (isLeft) ? ((Double)ret).doubleValue() :
									-((Double)ret).doubleValue();
			LOGOPP.canvas.turtle.setAngle(LOGOPP.canvas.turtle.getAngle() - turn);
			System.out.println("basic:turn finished");	
		} else {
			//TODO:errorhandler
		}
	}

	/*
	 * Move turtle from current place to target place
	 * TODO: wrap or fence
	 * @endX: target X pos
	 * @endY: target Y pos
	 * @isDraw: true for pendown, false for penup
	 */
	private void moveTurtle(double endX, double endY, boolean isDraw) {
		if (isDraw) {
			double startX = LOGOPP.canvas.turtle.getXPos();
			double startY = LOGOPP.canvas.turtle.getYPos();
			double length = Math.sqrt((endX - startX) * (endX - startX) +
										(endY - startY) * (endY - startY));
			double deltaX = (endX - startX) / length;
			double deltaY = (endY - startY) / length;
			int count = (int)length;
			for (int cnt = 0; cnt < count; cnt++) {
				LOGOPP.canvas.paintPoint((int)(startX + cnt * deltaX),
										(int)(startY + cnt * deltaY));
				LOGOPP.canvas.turtle.setXPos(startX + cnt * deltaX);
				LOGOPP.canvas.turtle.setYPos(startY + cnt * deltaY);
				double speed = 0.;
				while (speed < LOGOTurtle.SPEED_ITR_MAX) {
					LOGOPP.canvas.repaint();
					speed += LOGOPP.canvas.turtle.getSpeed();
				}
			}
			LOGOPP.canvas.paintPoint((int)endX, (int)endY);
		}
		LOGOPP.canvas.turtle.setXPos(endX);
		LOGOPP.canvas.turtle.setYPos(endY);
		LOGOPP.canvas.repaint();
	}

	/*
	 * Directly move target to a certain place
	 * @arg0: LOGONode returning coordinate(s) of target position
	 * @setX, @setY: true flase for only setting X pos
	 * 				 flase true for only setting Y pos
	 * 				 true true for setting both, arg0 should be a pair
	 */
	public void teleport(LOGONode arg0, boolean setX, boolean setY) {
		if (!setX && !setY)
			return;
		if (setX && setY);
			//TODO: handle pair
		else { //setX or setY
			Object ret = arg0.run();
			if (ret instanceof Double) {
				double value = ((Double)ret).doubleValue();
				if (setX)
					moveTurtle(value, LOGOPP.canvas.turtle.getYPos(), false);
				else //setY
					moveTurtle(LOGOPP.canvas.turtle.getXPos(), value, false);
			} else {
				//TODO:error handling
			}
		}
	}

	/*
	 * Check LOGONode return value's type
	 * In fact, we could check in functions, and let errorhandler
	 * print the error messages, so this function could be ignored
	 * @arg0: target node for checking
	 * @checkclass: an instance of expected class
	 * @return: if correct, return object returned by node
	 * 			if not, return null
	 */
	public Object checkType(LOGONode arg0, Object checkclass) {
		Object var = arg0.run();
		try {
			if (var.getClass().equals(checkclass.getClass()))
				return var;
			System.out.println("Expected type:" + checkclass.getClass().getName() + 
						"but given type:" + var.getClass().getName());
		} catch (Exception e) {
			
		}
		return null;
	} 
}
