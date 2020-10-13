public class Country {
        private String name;
        private String capitol;
        private double population;
        private double GDP;
        private int covidCases;
        private double covidDeaths;


        public Country(String[] values) {
            this.capitol = values[1];
            this.name = values[0];
            this.population = Double.parseDouble(values[2]);
            this.GDP = Double.parseDouble(values[3]);
            this.covidCases = Integer.parseInt(values[4]);
            this.covidDeaths = Double.parseDouble(values[5]);
        }

        /*
      This takes in nothing
      <p>
      This returns whatever the covidCases has been set to.
    */
        public int getCovidCases() {
            return covidCases;
        }

        /*
            This returns whatever the covidDeaths has been set to.
        */
        public double getCovidDeaths() {
            return covidDeaths;
        }

        /*
           This takes in nothing
            <p>
           This returns whatever the GDP has been set to.
        */
        public double getGDP() {
            return GDP;
        }

        /*
           This takes in nothing
            <p>
           This returns whatever the population has been set to.
        */
        public double getPopulation() {
            return population;
        }

        /*
            This takes in nothing
            <p>
            This returns whatever the capitol has been set to.
        */
        public String getCapitol() {
            return capitol;
        }

        /*
            This takes in nothing
            <p>
            This returns whatever the name has been set to.
        */
        public String getName() {
            return name;
        }

    /*
       This takes in nothing
        <p>
       This returns whatever the result of covidCases/covidDeaths has been set to, if the covidCases are greater than
        0. If not, it returns 0.
    */

        public double getCFR() {
            if(covidCases > 0) {
                return (covidDeaths/covidCases) * 100;
            } else {
                return 0;
            }
        }

        /*
            This takes in nothing
            <p>
            This returns whatever the result of GDP/population is.
        */
        public double getGDPPerCap() {
            return (GDP/population);
        }

        /*
            This takes in a String called capitol and sets that to the object parameter
         */
        public void setCapitol(String capitol) {
            this.capitol = capitol;
        }

        /*
            This takes in a int called covidCases and sets that to the object parameter
         */
        public void setCovidCases(int covidCases) {
            this.covidCases = covidCases;
        }

        /*
            This takes in a double called covidDeaths and sets that to the object parameter
         */
        public void setCovidDeaths(double covidDeaths) {
            this.covidDeaths = covidDeaths;
        }

        /*
            This takes in a double called GDP and sets that to the object parameter
         */
        public void setGDP(double GDP) {
            this.GDP = GDP;
        }

        /*
            This takes in a String called name and sets that to the object parameter
         */
        public void setName(String name) {
            this.name = name;
        }

        /*
        This takes in a double called population and sets that to the object parameter
     */
        public void setPopulation(double population) {
            this.population = population;
        }

        @Override
        public String toString() {
            return (getName() + " " + getCapitol() + " " + getPopulation() + " " + getGDP() + " "  + getCovidCases() + " " + getCovidDeaths());
        }
}

