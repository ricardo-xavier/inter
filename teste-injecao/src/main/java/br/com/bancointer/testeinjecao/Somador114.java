package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador114")
public class Somador114 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
