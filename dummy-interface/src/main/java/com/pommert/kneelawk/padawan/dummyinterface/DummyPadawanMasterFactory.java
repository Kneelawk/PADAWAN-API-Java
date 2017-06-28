package com.pommert.kneelawk.padawan.dummyinterface;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pommert.kneelawk.padawan.api.PadawanMaster.Builder;
import com.pommert.kneelawk.padawan.api.PadawanMasterFactory;

public class DummyPadawanMasterFactory implements PadawanMasterFactory {

	Log log = LogFactory.getLog(getClass());

	public DummyPadawanMasterFactory() {
		log.info("Constructed");
	}

	@Override
	public Builder createPadawanMasterBuilder() {
		log.info("Creating PadawanMasterBuilder");
		return null;
	}

}
