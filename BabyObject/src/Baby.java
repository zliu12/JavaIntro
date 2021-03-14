/**
 * Baby Class
 *
 * Copyright (c) [2021], Zhao Liu.
 */

/* Description - Baby's features
1. A baby has the name and the age
2. A baby eats a few times a day: hungry
3. A baby cries a few times a day: cry
4. A baby pees a few times a day: pee
5. A baby poops a few times a day: pop
6. A baby naps a few times a day: nap
8. A baby smiles: smile
9. A baby yawns a few times day: sleepy
10.A baby need a diaper change a few times a day: diaperFull
 */

/**
 * A Baby class describles some features of the baby, including what a baby
 * does, how the baby feels, what does a baby demand, etc.
 */

public class Baby {
	// Declare variables
	private boolean isMale;
	private boolean isHungry;
	private boolean isCrying;
	private boolean isPeeing;
	private boolean isPooping;
	private boolean isSleepy;
	private boolean diaperFull;
	private String name;
	private int ageInMonth;
	private int eatCount;
	private int cryCount;
	private int peeCount;
	private int poopCount;
	private int napCount;
	private int diaperUsed;
	private int diaperChanged;
	private int yawnCount;

	private static int diaperUsedTotal = 0;
	private static int babiesCount = 0;
	private static int blue = 0;
	private static int pink = 0;
	private static int eatCountTotal = 0;
	private static int cryCountTotal = 0;

	public Baby(String name, int ageInMonth, boolean isMale) {
		this.name = name;
		this.ageInMonth = ageInMonth;
		this.isMale = isMale;
		isHungry = false;
		isPooping = false;
		isPeeing = false;
		isSleepy = false;
		diaperFull = false;
		yawnCount = 0;
		eatCount = 0;
		peeCount = 0;
		poopCount = 0;
		napCount = 0;
		diaperUsed = 1;
		diaperChanged = 0;
		setBabiesCount();
	
		if (getGender()) {
			setNumOfBlue();
		} else {
			setNumOfPink();
		}
	}

	/**
	 * Method gets the baby's name.
	 * @return name of the baby.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method gets the baby's age in months.
	 * @return age in monthods of the baby.
	 */
	public int getAge() {
		return ageInMonth;
	}

	/**
	 * Method gets the baby's gender.
	 * @return false if female, true if male.
	 */
	public boolean getGender() {
		return isMale;
	}

	/**
	 * Method checkes if the baby is hungry.
	 * @return true if hungry, false if not hungry.
	 */
	public boolean isHungry() {
		return isHungry;
	}

	/**
	 * Method checks if the baby is crying.
	 * @return true if a baby is crying, false otherwise.
	 */
	public boolean isCrying() {
		return isCrying;
	}

	/**
	 * Method checks if the baby is peeing.
	 * @return true if peeing, false if not peeing.
	 */
	public boolean isPeeing() {
		return isPeeing;
	}

	/**
	 * Method checks if the baby is pooping.
	 * @return true if pooping, false if not pooping.
	 */
	public boolean isPooping() {
		return isPooping;
	}

	/**
	 * Method checks if the baby is sleepy.
	 * @return true if sleepy, false if not sleepy.
	 */
	public boolean isSleepy() {
		return isSleepy;
	}

	/**
	 * Method checks if the baby's diaper is full.
	 * @return true if the diaper is full, false if not.
	 */
	public boolean diaperFull() {
		return diaperFull;
	}

	/**
	 * Method sets the number of diaper used.
	 */
	public void setDiaperUsed() {
		diaperUsed++;
	}

	/**
	 * Method gets the number of diapers the baby has used.
	 * @return the number of diapers one baby has used.
	 */
	public int getDiaperUsed() {
		return diaperUsed;
	}

	/**
	 * Method sets the times of changing diapers.
	 */
	public void setDiaperChanged() {
		diaperChanged++;
	}

	/**
	 * Method gets the number of diaper changes of the baby.
	 * @return the number of diaper changes of one baby.
	 */
	public int getDiaperChanged() {
		return diaperChanged;
	}

	/**
	 * Method sets the times of eating.
	 */
	public void setEatCount() {
		eatCount++;
	}

	/**
	 * Method gets how many times that a baby has eaten.
	 * @return a baby's number of eating times.
	 */
	public int getEatCount() {
		return eatCount;
	}

	/**
	 * Method sets the times of crying.
	 */
	public void setCryCount() {
		cryCount++;
	}

	/**
	 * Method gets how many times the baby cries.
	 * @return the number of crying times of a baby
	 */
	public int getCryCount() {
		return cryCount;
	}

	/**
	 * Method sets the time of pee.
	 */
	public void setPeeCount() {
		peeCount++;
	}

	/**
	 * Method gets how many times the baby cries.
	 * @return the number of crying times of a baby.
	 */
	public int getPeeCount() {
		return peeCount;
	}

	/**
	 * Method sets the baby's poop times.
	 */
	public void setPoopCount() {
		poopCount++;
	}

	/**
	 * Method gets how many times the baby poops.
	 * @return the number of pooping times of a baby.
	 */
	public int getPoopCount() {
		return poopCount;
	}

	/**
	 * Method set the baby's nap times.
	 */
	public void setNapCount() {
		napCount++;
	}

	/**
	 * Method gets how many times the baby takes a nap.
	 * @return the number of napping times of a baby.
	 */
	public int getNapCount() {
		return napCount;
	}

	/**
	 * Method sets the times of yawn of the baby.
	 */
	public void setYawnCount() {
		yawnCount++;
	}

	/**
	 * Method gets how many times the baby yawns.
	 * @return the number of yawn times of a baby.
	 */
	public int getYawnCount() {
		return yawnCount;
	}

	/**
	 * Method sets the total number of diapers used.
	 */
	public static void setDiaperUsedTotal() {
		diaperUsedTotal++;
	}

	/**
	 * Method gets how many diapers have been consumed in total.
	 * @return the total number of diapers consumed.
	 */
	public static int getDiaperUsedTotal() {
		return diaperUsedTotal;
	}

	/**
	 * Method sets the total number of male babies.
	 */
	public static void setNumOfBlue() {
		blue++;
	}
	
	/**
	 * Method gets the number of baby boys.
	 * @return the number of baby boys.
	 */
	public static int getBlueCount() {
		return blue;
	}

	/**
	 * Method sets the total number of female babies.
	 */
	public static void setNumOfPink() {
		pink++;
	}

	/**
	 * Method gets the number of baby girls.
	 * @return the number of baby girls.
	 */
	public static int getPinkCount() {
		return pink;
	}

	/**
	 * Method sets the total number of babies.
	 */
	public static void setBabiesCount() {
		babiesCount++;
	}
	
	/**
	 * Method gets the total number of babies.
	 * @return the number of babies.
	 */
	public static int getBabiesCount() {
		return babiesCount;
	}

	/**
	 * Method sets the total times of eating.
	 */
	public static void setEatCountTotal() {
		eatCountTotal++;
	}

	/**
	 * Method gets the number of total meals.
	 * @return the total number of eating.
	 */
	public static int getEatCountTotal() {
		return eatCountTotal;
	}

	/**
	 * Method sets the total times of crying.
	 */
	public static void setCryCountTotal() {
		cryCountTotal++;
	}

	/**
	 * Method gets the number of babies cry in total.
	 * @return the total number of crying times.
	 */
	public static int getCryCountTotal() {
		return cryCountTotal;
	}

	/**
	 * Method describes when a baby eats.
	 */
	public void feed() {
		isCrying = false;
		isHungry = false;
		setEatCount();
		setEatCountTotal();
	}

	/**
	 * Method describes when a baby is sleepy.
	 */
	public void sleep() {
		isSleepy = true;
		setYawnCount();
		setNapCount();
	}

	/**
	 * Method describes when a baby wakes up.
	 */
	public void wakeUp() {
		isSleepy = false;

		if (getEatCount() < 6) {
			isHungry = true;
		} else {
			isHungry = false;
		}

		if (isPeeing() || isPooping()) {
			isCrying = true;
		} else {
			isCrying = false;
		}
	}

	/**
	 * Method describes when a baby pees.
	 */
	public void pee() {
		isPeeing = true;
		setPeeCount();

		if (getPeeCount() > 2) {
			diaperFull = true;
			setDiaperChanged();
			setDiaperUsed();
			setDiaperUsedTotal();
		}
	}
	
	/**
	 * Method describes when a baby poops.
	 */
	public void poop() {
		isPooping = true;
		setPoopCount();
		diaperFull = true;
		setDiaperChanged();
		setDiaperUsed();
		setDiaperUsedTotal();
	}

	public void cry() {
		isCrying = true;
		
		if(getEatCount() < 6) {
			isHungry = true;
			System.out.println(getName() + " might be hungry.");
		} else if (diaperFull) {
			System.out.println(getName() + " might need a diaper change.");
		} else {
			System.out.println(getName() + " might need a hug.");
		}
	}
}
