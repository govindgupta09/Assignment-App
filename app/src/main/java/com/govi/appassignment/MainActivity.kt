package com.govi.appassignment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.govi.appassignment.adapter.BetNowAdapter
import com.govi.appassignment.adapter.FrameAdapter
import com.govi.appassignment.adapter.MatchPreviewAdapter
import com.govi.appassignment.dataModel.BetNowItem
import com.govi.appassignment.dataModel.FrameItem
import com.govi.appassignment.dataModel.MatchPreviewItem
import com.govi.appassignment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.frameCoin.setOnClickListener {
            blur()
            binding.scrollExploreCl.visibility = View.VISIBLE
        }
        binding.constraintLayout.setOnClickListener {
            unBlur()
            binding.scrollExploreCl.visibility = View.INVISIBLE
            binding.scrollExploreCl1.visibility = View.INVISIBLE
        }

        binding.tvExplorePageRewards.setOnClickListener {
            if (binding.scrollExploreCl.visibility == View.VISIBLE) {
                blur()
                binding.scrollExploreCl.visibility = View.INVISIBLE
                binding.scrollExploreCl1.visibility = View.VISIBLE
            } else {
                unBlur()
                binding.scrollExploreCl.visibility = View.VISIBLE
                binding.scrollExploreCl1.visibility = View.INVISIBLE
            }
        }

        binding.tvExplorePageRewards1.setOnClickListener {
            if (binding.scrollExploreCl1.visibility == View.VISIBLE) {
                blur()
                binding.scrollExploreCl1.visibility = View.INVISIBLE
                binding.scrollExploreCl.visibility = View.VISIBLE
            } else {
                unBlur()
                binding.scrollExploreCl1.visibility = View.VISIBLE
                binding.scrollExploreCl.visibility = View.INVISIBLE
            }
        }


        val items = listOf(
            BetNowItem(
                R.drawable.img_flag_espanyol,
                R.drawable.img_flag_madrid,
                "Espanyol",
                "Atl. Madrid",
                7,
                2,
                "72 min"
            ),
            BetNowItem(
                R.drawable.img_flag_leeds,
                R.drawable.img_flag_liverpool,
                "Leeds Utd.",
                "Liverpool",
                1,
                3,
                "36 min"
            ),
            BetNowItem(
                R.drawable.img_flag_espanyol,
                R.drawable.img_flag_madrid,
                "Espanyol",
                "Atl. Madrid",
                7,
                2,
                "72 min"
            ),
            BetNowItem(
                R.drawable.img_flag_leeds,
                R.drawable.img_flag_liverpool,
                "Leeds Utd.",
                "Liverpool",
                1,
                3,
                "36 min"
            ),
            BetNowItem(
                R.drawable.img_flag_espanyol,
                R.drawable.img_flag_madrid,
                "Espanyol",
                "Atl. Madrid",
                7,
                2,
                "72 min"
            ),
            BetNowItem(
                R.drawable.img_flag_leeds,
                R.drawable.img_flag_liverpool,
                "Leeds Utd.",
                "Liverpool",
                1,
                3,
                "36 min"
            ),
            BetNowItem(
                R.drawable.img_flag_espanyol,
                R.drawable.img_flag_madrid,
                "Espanyol",
                "Atl. Madrid",
                7,
                2,
                "72 min"
            ),
            BetNowItem(
                R.drawable.img_flag_leeds,
                R.drawable.img_flag_liverpool,
                "Leeds Utd.",
                "Liverpool",
                1,
                3,
                "36 min"
            ),
            BetNowItem(
                R.drawable.img_flag_espanyol,
                R.drawable.img_flag_madrid,
                "Espanyol",
                "Atl. Madrid",
                7,
                2,
                "72 min"
            ),
            BetNowItem(
                R.drawable.img_flag_leeds,
                R.drawable.img_flag_liverpool,
                "Leeds Utd.",
                "Liverpool",
                1,
                3,
                "36 min"
            ),
            // Add more items as needed
        )
        val adapter = BetNowAdapter(items)
        binding.recyclerViewBetNow.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewBetNow.adapter = adapter


        /**
         * Below is for frame adapter
         */
        val frameItems = listOf(
            FrameItem(R.drawable.img_usab, "USAB"),
            FrameItem(R.drawable.img_dal, "DAL"),
            FrameItem(R.drawable.img_ncaaf, "NCAAF"),
            FrameItem(R.drawable.img_madrid, "MADRID"),
            FrameItem(R.drawable.img_phi, "PHI"),
            FrameItem(R.drawable.img_usab, "USAB"),
            FrameItem(R.drawable.img_dal, "DAL"),
            FrameItem(R.drawable.img_ncaaf, "NCAAF"),
            FrameItem(R.drawable.img_madrid, "MADRID"),
            FrameItem(R.drawable.img_phi, "PHI"),
            FrameItem(R.drawable.img_usab, "USAB"),
            FrameItem(R.drawable.img_dal, "DAL"),
            FrameItem(R.drawable.img_ncaaf, "NCAAF"),
            FrameItem(R.drawable.img_madrid, "MADRID"),
            FrameItem(R.drawable.img_phi, "PHI")
        )
        val frameAdapter = FrameAdapter(frameItems)
        binding.recyclerViewFrame.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewFrame.adapter = frameAdapter


        /**
         * Below is for match preview adapter
         */
        val matchList = generateDummyMatchList()
        val matchPreview = MatchPreviewAdapter(matchList)
        binding.recyclerViewMatchPreview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewMatchPreview.adapter = matchPreview

    }

    private fun generateDummyMatchList(): List<MatchPreviewItem> {
        val dummyList = mutableListOf<MatchPreviewItem>()
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        dummyList.add(
            MatchPreviewItem(
                R.drawable.img_champions_league,
                "BARCELONA",
                "BAYERN MUNCHEN",
                "2:20"
            )
        )
        return dummyList
    }


    private fun blur() {
        binding.imgLogo.alpha = 0.1f
        binding.imgWallet.alpha = 0.1f
        binding.iconBell.alpha = 0.1f
        binding.frameAddingSoon.alpha = 0.1F
        binding.frameCricket.alpha = 0.1f
        binding.frameFootball.alpha = 0.1f
        binding.frameLive.alpha = 0.1f
        binding.tvLiveMatches.alpha = 0.1f
        binding.recyclerViewBetNow.alpha = 0.1f
        binding.imgFire.alpha = 0.1f
        binding.tvFire.alpha = 0.1f
        binding.recyclerViewFrame.alpha = 0.1f
        binding.frameCoin.alpha = 0.1f
        binding.imgRapidFire.alpha = 0.1f
        binding.tvRapidFire.alpha = 0.1f
        binding.tvQuestions.alpha = 0.1f
        binding.dashboard.alpha = 0.1f
        binding.tvMatchPreview.alpha = 0.1f
        binding.tvViewAll.alpha = 0.1f
        binding.recyclerViewMatchPreview.alpha = 0.1f
    }

    fun unBlur(){
        binding.imgLogo.alpha = 1F
        binding.imgWallet.alpha = 1F
        binding.iconBell.alpha = 1F
        binding.frameAddingSoon.alpha = 1F
        binding.frameCricket.alpha = 1F
        binding.frameFootball.alpha = 1F
        binding.frameLive.alpha = 1F
        binding.tvLiveMatches.alpha = 1F
        binding.recyclerViewBetNow.alpha = 1F
        binding.imgFire.alpha = 1F
        binding.tvFire.alpha = 1F
        binding.recyclerViewFrame.alpha = 1F
        binding.frameCoin.alpha = 1F
        binding.imgRapidFire.alpha = 1F
        binding.tvRapidFire.alpha = 1F
        binding.tvQuestions.alpha = 1F
        binding.dashboard.alpha = 1F
        binding.tvMatchPreview.alpha = 1F
        binding.tvViewAll.alpha = 1F
        binding.recyclerViewMatchPreview.alpha = 1F
    }

    override fun onBackPressed() {
        unBlur()
        super.onBackPressed()
    }
}

