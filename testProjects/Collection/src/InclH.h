/* This file contains examples from https://github.com/torvalds/linux/drivers/scsi/BusLogic.h */
#ifndef INCLH_H_
#define INCLH_H_

typedef int bool;
#define true 1
#define false 0

enum blogic_msglevel {
	BLOGIC_ANNOUNCE_LEVEL = 0,
	BLOGIC_INFO_LEVEL = 1,
	BLOGIC_NOTICE_LEVEL = 2,
	BLOGIC_WARN_LEVEL = 3,
	BLOGIC_ERR_LEVEL = 4
};

#define blogic_announce(format, args...) \
		blogic_msg(BLOGIC_ANNOUNCE_LEVEL, format, ##args)

#ifdef CONFIG_SCSI_FLASHPOINT

#define blogic_multimaster_type(adapter) \
	(adapter->adapter_type == BLOGIC_MULTIMASTER)

#define blogic_flashpoint_type(adapter) \
	(adapter->adapter_type == BLOGIC_FLASHPOINT)

#else

#define blogic_multimaster_type(adapter)	(true)
#define blogic_flashpoint_type(adapter)		(false)

#endif

static char *blogic_adapter_busnames[] = { "Unknown", "ISA", "EISA", "PCI",
		"VESA", "MCA" };

struct blogic_byte_count {
	unsigned int units;
	unsigned int billions;
};

union blogic_cntrl_reg {
	unsigned char all;
	struct {
		unsigned char :4; /* Bits 0-3 */
		bool bus_reset :1; /* Bit 4 */
		bool int_reset :1; /* Bit 5 */
		bool soft_reset :1; /* Bit 6 */
		bool hard_reset :1; /* Bit 7 */
	} cr;
};

static inline void blogic_busreset(struct blogic_adapter *adapter) {
	union blogic_cntrl_reg cr;
	cr.all = 0;
	cr.cr.bus_reset = true;
}

static int blogic_diskparam(struct scsi_device *sdev, struct block_device *dev, int *params);

#endif
