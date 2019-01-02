package parseaparment;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;

public class DirectionsRequester {
    private OkHttpClient client = new OkHttpClient();
    private String apiKey = "BRLJg4NCNfGcz5UJD8We4G2AQ5WOXvMR";
    private String apiUrl = "http://www.mapquestapi.com/directions/v2/route";
    private String inputStartLocation;
    private String inputEndLocation = "1740 Wehrle Dr, Buffalo, NY 14221";
    private String inputTime;

    private String outputDistance;
    private String outputBestTime;
    private String outputRealTime;
    private String outputFuelUsed;

    public DirectionsRequester() throws IOException {
        System.out.println(getDirectionJson());
    }

    private String getDirectionJson() throws IOException {
        String url = apiUrl + "?key=" + apiKey + "&from=" + inputStartLocation + "&to=" + inputEndLocation;
        Request request = new Request.Builder()
                .url(url)
                .build();
        System.out.println(request);
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        return response.body().string();
    }



    class Options {
        @SerializedName("arteryWeights")
        @Expose
        private List<Object> arteryWeights = null;
        @SerializedName("cyclingRoadFactor")
        @Expose
        private Integer cyclingRoadFactor;
        @SerializedName("timeType")
        @Expose
        private Integer timeType;
        @SerializedName("useTraffic")
        @Expose
        private Boolean useTraffic;
        @SerializedName("returnLinkDirections")
        @Expose
        private Boolean returnLinkDirections;
        @SerializedName("countryBoundaryDisplay")
        @Expose
        private Boolean countryBoundaryDisplay;
        @SerializedName("enhancedNarrative")
        @Expose
        private Boolean enhancedNarrative;
        @SerializedName("locale")
        @Expose
        private String locale;
        @SerializedName("tryAvoidLinkIds")
        @Expose
        private List<Object> tryAvoidLinkIds = null;
        @SerializedName("drivingStyle")
        @Expose
        private Integer drivingStyle;
        @SerializedName("doReverseGeocode")
        @Expose
        private Boolean doReverseGeocode;
        @SerializedName("generalize")
        @Expose
        private Integer generalize;
        @SerializedName("mustAvoidLinkIds")
        @Expose
        private List<Object> mustAvoidLinkIds = null;
        @SerializedName("sideOfStreetDisplay")
        @Expose
        private Boolean sideOfStreetDisplay;
        @SerializedName("routeType")
        @Expose
        private String routeType;
        @SerializedName("avoidTimedConditions")
        @Expose
        private Boolean avoidTimedConditions;
        @SerializedName("routeNumber")
        @Expose
        private Integer routeNumber;
        @SerializedName("shapeFormat")
        @Expose
        private String shapeFormat;
        @SerializedName("maxWalkingDistance")
        @Expose
        private Integer maxWalkingDistance;
        @SerializedName("destinationManeuverDisplay")
        @Expose
        private Boolean destinationManeuverDisplay;
        @SerializedName("transferPenalty")
        @Expose
        private Integer transferPenalty;
        @SerializedName("narrativeType")
        @Expose
        private String narrativeType;
        @SerializedName("walkingSpeed")
        @Expose
        private Integer walkingSpeed;
        @SerializedName("urbanAvoidFactor")
        @Expose
        private Integer urbanAvoidFactor;
        @SerializedName("stateBoundaryDisplay")
        @Expose
        private Boolean stateBoundaryDisplay;
        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("highwayEfficiency")
        @Expose
        private Integer highwayEfficiency;
        @SerializedName("maxLinkId")
        @Expose
        private Integer maxLinkId;
        @SerializedName("maneuverPenalty")
        @Expose
        private Integer maneuverPenalty;
        @SerializedName("avoidTripIds")
        @Expose
        private List<Object> avoidTripIds = null;
        @SerializedName("filterZoneFactor")
        @Expose
        private Integer filterZoneFactor;
        @SerializedName("manmaps")
        @Expose
        private String manmaps;

        public List<Object> getArteryWeights() {
            return arteryWeights;
        }

        public void setArteryWeights(List<Object> arteryWeights) {
            this.arteryWeights = arteryWeights;
        }

        public Integer getCyclingRoadFactor() {
            return cyclingRoadFactor;
        }

        public void setCyclingRoadFactor(Integer cyclingRoadFactor) {
            this.cyclingRoadFactor = cyclingRoadFactor;
        }

        public Integer getTimeType() {
            return timeType;
        }

        public void setTimeType(Integer timeType) {
            this.timeType = timeType;
        }

        public Boolean getUseTraffic() {
            return useTraffic;
        }

        public void setUseTraffic(Boolean useTraffic) {
            this.useTraffic = useTraffic;
        }

        public Boolean getReturnLinkDirections() {
            return returnLinkDirections;
        }

        public void setReturnLinkDirections(Boolean returnLinkDirections) {
            this.returnLinkDirections = returnLinkDirections;
        }

        public Boolean getCountryBoundaryDisplay() {
            return countryBoundaryDisplay;
        }

        public void setCountryBoundaryDisplay(Boolean countryBoundaryDisplay) {
            this.countryBoundaryDisplay = countryBoundaryDisplay;
        }

        public Boolean getEnhancedNarrative() {
            return enhancedNarrative;
        }

        public void setEnhancedNarrative(Boolean enhancedNarrative) {
            this.enhancedNarrative = enhancedNarrative;
        }

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public List<Object> getTryAvoidLinkIds() {
            return tryAvoidLinkIds;
        }

        public void setTryAvoidLinkIds(List<Object> tryAvoidLinkIds) {
            this.tryAvoidLinkIds = tryAvoidLinkIds;
        }

        public Integer getDrivingStyle() {
            return drivingStyle;
        }

        public void setDrivingStyle(Integer drivingStyle) {
            this.drivingStyle = drivingStyle;
        }

        public Boolean getDoReverseGeocode() {
            return doReverseGeocode;
        }

        public void setDoReverseGeocode(Boolean doReverseGeocode) {
            this.doReverseGeocode = doReverseGeocode;
        }

        public Integer getGeneralize() {
            return generalize;
        }

        public void setGeneralize(Integer generalize) {
            this.generalize = generalize;
        }

        public List<Object> getMustAvoidLinkIds() {
            return mustAvoidLinkIds;
        }

        public void setMustAvoidLinkIds(List<Object> mustAvoidLinkIds) {
            this.mustAvoidLinkIds = mustAvoidLinkIds;
        }

        public Boolean getSideOfStreetDisplay() {
            return sideOfStreetDisplay;
        }

        public void setSideOfStreetDisplay(Boolean sideOfStreetDisplay) {
            this.sideOfStreetDisplay = sideOfStreetDisplay;
        }

        public String getRouteType() {
            return routeType;
        }

        public void setRouteType(String routeType) {
            this.routeType = routeType;
        }

        public Boolean getAvoidTimedConditions() {
            return avoidTimedConditions;
        }

        public void setAvoidTimedConditions(Boolean avoidTimedConditions) {
            this.avoidTimedConditions = avoidTimedConditions;
        }

        public Integer getRouteNumber() {
            return routeNumber;
        }

        public void setRouteNumber(Integer routeNumber) {
            this.routeNumber = routeNumber;
        }

        public String getShapeFormat() {
            return shapeFormat;
        }

        public void setShapeFormat(String shapeFormat) {
            this.shapeFormat = shapeFormat;
        }

        public Integer getMaxWalkingDistance() {
            return maxWalkingDistance;
        }

        public void setMaxWalkingDistance(Integer maxWalkingDistance) {
            this.maxWalkingDistance = maxWalkingDistance;
        }

        public Boolean getDestinationManeuverDisplay() {
            return destinationManeuverDisplay;
        }

        public void setDestinationManeuverDisplay(Boolean destinationManeuverDisplay) {
            this.destinationManeuverDisplay = destinationManeuverDisplay;
        }

        public Integer getTransferPenalty() {
            return transferPenalty;
        }

        public void setTransferPenalty(Integer transferPenalty) {
            this.transferPenalty = transferPenalty;
        }

        public String getNarrativeType() {
            return narrativeType;
        }

        public void setNarrativeType(String narrativeType) {
            this.narrativeType = narrativeType;
        }

        public Integer getWalkingSpeed() {
            return walkingSpeed;
        }

        public void setWalkingSpeed(Integer walkingSpeed) {
            this.walkingSpeed = walkingSpeed;
        }

        public Integer getUrbanAvoidFactor() {
            return urbanAvoidFactor;
        }

        public void setUrbanAvoidFactor(Integer urbanAvoidFactor) {
            this.urbanAvoidFactor = urbanAvoidFactor;
        }

        public Boolean getStateBoundaryDisplay() {
            return stateBoundaryDisplay;
        }

        public void setStateBoundaryDisplay(Boolean stateBoundaryDisplay) {
            this.stateBoundaryDisplay = stateBoundaryDisplay;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Integer getHighwayEfficiency() {
            return highwayEfficiency;
        }

        public void setHighwayEfficiency(Integer highwayEfficiency) {
            this.highwayEfficiency = highwayEfficiency;
        }

        public Integer getMaxLinkId() {
            return maxLinkId;
        }

        public void setMaxLinkId(Integer maxLinkId) {
            this.maxLinkId = maxLinkId;
        }

        public Integer getManeuverPenalty() {
            return maneuverPenalty;
        }

        public void setManeuverPenalty(Integer maneuverPenalty) {
            this.maneuverPenalty = maneuverPenalty;
        }

        public List<Object> getAvoidTripIds() {
            return avoidTripIds;
        }

        public void setAvoidTripIds(List<Object> avoidTripIds) {
            this.avoidTripIds = avoidTripIds;
        }

        public Integer getFilterZoneFactor() {
            return filterZoneFactor;
        }

        public void setFilterZoneFactor(Integer filterZoneFactor) {
            this.filterZoneFactor = filterZoneFactor;
        }

        public String getManmaps() {
            return manmaps;
        }

        public void setManmaps(String manmaps) {
            this.manmaps = manmaps;
        }
    }
}
