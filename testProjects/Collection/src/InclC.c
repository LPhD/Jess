/* This file contains examples from https://github.com/torvalds/linux/drivers/scsi/FlashPoint.c */

#define  hp_stack_data        0x34
#define hp_stack_addr 0x35
#define WR_HARPOON(ioport,val) (u8) val, (u32)ioport
#define MAX_SCSI_TAR 16
#define RD_HARPOON(ioport) (u32)ioport
#define hp_scsidata_0 0x74

#define u32 unsigned  int
#define u16 unsigned int
#define u8 unsigned int

struct sccb;
typedef void (*CALL_BK_FN)(struct sccb *);

struct sccb_mgr_info {
	u32 si_baseaddr;
	unsigned char si_present;
	u16 si_per_targ_init_sync;
	unsigned char si_reserved[4];
};

static void FPT_WrStack(u32 portBase, unsigned char index, unsigned char data) {
	WR_HARPOON(portBase + hp_stack_addr, index);
	WR_HARPOON(portBase + hp_stack_data, data);
}

static void FPT_scwirod(u32 p_port, unsigned char p_data_bit) {
	unsigned char i;
	i = 0;
	while (i < MAX_SCSI_TAR) {
		if (RD_HARPOON(p_port + hp_scsidata_0) & p_data_bit)
			i = 0;
		else
			i++;
	}
}
