package com.sgaraba.health.repository.search;

import com.sgaraba.health.domain.Weight;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Weight} entity.
 */
public interface WeightSearchRepository extends ElasticsearchRepository<Weight, Long> {
}
