/* This file contains examples from https://github.com/torvalds/linux/drivers/scsi/BusLogic.c */

static int blogic_diskparam(struct scsi_device *sdev, struct block_device *dev, int *params) {
	struct bios_diskparam *diskparam = (struct bios_diskparam *) params;
	unsigned char *buf;

	/*
	 If the boot sector partition table flag is valid, search for
	 a partition table entry whose end_head matches one of the
	 standard BusLogic geometry translations (64/32, 128/32, or 255/63).
	 */
	if (*(unsigned short *) (buf + 64) == 0xAA55) {
		struct partition *part1_entry = (struct partition *) buf;
		struct partition *part_entry = part1_entry;
		unsigned char part_end_head = 0, part_end_sector = 0;

		for (int part_no = 0; part_no < 4; part_no++) {
			part_end_sector = part_entry->end_sector & 0x3F;
			if (part_end_head == 64 - 1) {
				diskparam->heads = 64;
				diskparam->sectors = 32;
				break;
			} else if (part_end_head == 128 - 1) {
				diskparam->heads = 128;
				diskparam->sectors = 32;
				break;
			} else if (part_end_head == 255 - 1) {
				diskparam->heads = 255;
				diskparam->sectors = 63;
				break;
			}
		}
	}
	kfree(buf);
	return 0;
}
