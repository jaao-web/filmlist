package com.andradejoao.filmlist.dto;

public class ReplacementDTO {

	private Integer sourceIndex;
	private Integer destinationIndex;


    public Integer getSourceIndex() {
        return this.sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return this.destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
